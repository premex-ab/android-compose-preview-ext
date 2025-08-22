package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LT_mobile device specifications for Android Compose previews.
 *
 * This extension provides LT_mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LTmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LTmobile: Any
  get() = object {
      /** LT_mobile LT_mobile_C26 */
      val LT_MOBILE_C26 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** LT_mobile LT_mobile_C60 */
      val LT_MOBILE_C60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LT_mobile LT_mobile_E16 */
      val LT_MOBILE_E16 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LT_mobile LT_mobile_E18 */
      val LT_MOBILE_E18 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LT_mobile LT_mobile_S22 */
      val LT_MOBILE_S22 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LT_mobile LT_mobile_S33 */
      val LT_MOBILE_S33 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
