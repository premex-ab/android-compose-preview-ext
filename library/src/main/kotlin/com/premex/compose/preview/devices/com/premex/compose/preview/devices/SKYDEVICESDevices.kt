package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKY_DEVICES device specifications for Android Compose previews.
 *
 * This extension provides SKY_DEVICES device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKYDEVICES.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKYDEVICES: Any
  get() = object {
      /** DeviceSpec(manufacturer=SKY_DEVICES, code=Elite_D55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY_DEVICES, code=Elite_D55,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ELITE_D55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SKY_DEVICES, code=SKY_KID1us, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SKY_DEVICES, code=SKY_KID1us,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SKY_KID1US = "spec:width=600,height=1024,unit=px,dpi=160"

  }
