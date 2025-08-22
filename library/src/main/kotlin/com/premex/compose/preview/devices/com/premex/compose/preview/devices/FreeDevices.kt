package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Free device specifications for Android Compose previews.
 *
 * This extension provides Free device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Free.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Free: Any
  get() = object {
      /** DeviceSpec(manufacturer=Free, code=Free_Liberty_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Free, code=Free_Liberty_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val FREE_LIBERTY_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

  }
