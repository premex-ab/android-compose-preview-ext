package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HIKVISION device specifications for Android Compose previews.
 *
 * This extension provides HIKVISION device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HIKVISION.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HIKVISION: Any
  get() = object {
      /** DeviceSpec(manufacturer=HIKVISION, code=DS_D5C65RB_A, width=2160, height=3840, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKVISION, code=DS_D5C65RB_A,
      width=2160, height=3840, dpi=640, isGoogleDevice=false).code */
      val DS_D5C65RB_A = "spec:width=2160,height=3840,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=HIKVISION, code=DS-MDT202, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKVISION, code=DS-MDT202,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val DS_MDT202 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
