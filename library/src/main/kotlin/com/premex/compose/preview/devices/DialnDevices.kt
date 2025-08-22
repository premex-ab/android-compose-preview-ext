package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIALN device specifications for Android Compose previews.
 *
 * This extension provides DIALN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dialn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dialn: Any
  get() = object {
      /** DIALN G10 */
      val G10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DIALN G65 */
      val G65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DIALN S10 */
      val S10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DIALN S8 */
      val S8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DIALN X10G */
      val X10G = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DIALN X10ULTRA */
      val X10ULTRA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DIALN X10_Pulse */
      val X10_PULSE = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DIALN X62S */
      val X62S = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DIALN X8G */
      val X8G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DIALN X8ULTRA */
      val X8ULTRA = "spec:width=800,height=1280,unit=px,dpi=240"

  }
