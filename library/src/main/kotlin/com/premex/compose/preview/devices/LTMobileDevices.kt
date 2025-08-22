package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LT_Mobile device specifications for Android Compose previews.
 *
 * This extension provides LT_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LTMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LTMobile: Any
  get() = object {
      /** LT_Mobile LT_2003 */
      val LT_2003 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LT_Mobile LT_Mobile_E6707 */
      val LT_MOBILE_E6707 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
