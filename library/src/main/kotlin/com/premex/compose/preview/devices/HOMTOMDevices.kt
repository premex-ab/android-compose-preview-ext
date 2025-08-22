package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOMTOM device specifications for Android Compose previews.
 *
 * This extension provides HOMTOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOMTOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOMTOM: Any
  get() = object {
      /** HOMTOM C1 */
      val C1 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** HOMTOM C2 */
      val C2 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** HOMTOM H10 */
      val H10 = "spec:width=720,height=1512,unit=px,dpi=272"

      /** HOMTOM H5 */
      val H5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HOMTOM HT70 */
      val HT70 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HOMTOM HT80 */
      val HT80 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HOMTOM P30_Pro */
      val P30_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** HOMTOM S16 */
      val S16 = "spec:width=640,height=1136,unit=px,dpi=320"

      /** HOMTOM S99 */
      val S99 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** HOMTOM Z11 */
      val Z11 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
