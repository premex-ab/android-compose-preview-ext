package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTOUCH device specifications for Android Compose previews.
 *
 * This extension provides XTOUCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTOUCH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTOUCH: Any
  get() = object {
      /** DeviceSpec(manufacturer=XTOUCH, code=A5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTOUCH, code=A5, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=XTOUCH, code=S20, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTOUCH, code=S20, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val S20 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XTOUCH, code=XBot_Junior, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTOUCH, code=XBot_Junior,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val XBOT_JUNIOR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=XTOUCH, code=XBot_Senior, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTOUCH, code=XBot_Senior,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val XBOT_SENIOR = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=XTOUCH, code=XTOUCH_A4, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTOUCH, code=XTOUCH_A4, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val XTOUCH_A4 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=XTOUCH, code=XTOUCH_X10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XTOUCH, code=XTOUCH_X10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val XTOUCH_X10 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
