package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARGO device specifications for Android Compose previews.
 *
 * This extension provides ARGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARGO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARGO, code=osaki, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARGO, code=osaki, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
