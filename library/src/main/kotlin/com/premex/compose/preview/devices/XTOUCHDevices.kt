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
      /** XTOUCH A5 */
      val A5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** XTOUCH S20 */
      val S20 = "spec:width=480,height=960,unit=px,dpi=213"

      /** XTOUCH XBot_Junior */
      val XBOT_JUNIOR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** XTOUCH XBot_Senior */
      val XBOT_SENIOR = "spec:width=720,height=1440,unit=px,dpi=320"

      /** XTOUCH XTOUCH_A4 */
      val XTOUCH_A4 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** XTOUCH XTOUCH_X10 */
      val XTOUCH_X10 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
