package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Caltta device specifications for Android Compose previews.
 *
 * This extension provides Caltta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Caltta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Caltta: Any
  get() = object {
      /** DeviceSpec(manufacturer=Caltta, code=e720, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Caltta, code=e720, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E720 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
