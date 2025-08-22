package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BUDDY_PHONE device specifications for Android Compose previews.
 *
 * This extension provides BUDDY_PHONE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BUDDYPHONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BUDDYPHONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=BUDDY_PHONE, code=BP, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BUDDY_PHONE, code=BP, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val BP = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BUDDY_PHONE, code=P2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BUDDY_PHONE, code=P2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P2 = "spec:width=480,height=960,unit=px,dpi=240"

  }
