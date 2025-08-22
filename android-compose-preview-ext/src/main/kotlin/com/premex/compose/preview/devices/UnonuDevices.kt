package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNONU device specifications for Android Compose previews.
 *
 * This extension provides UNONU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unonu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unonu: Any
  get() = object {
      /** UNONU N63A */
      val N63A = "spec:width=720,height=1520,unit=px,dpi=300"

      /** UNONU UN55L */
      val UN55L = "spec:width=444,height=960,unit=px,dpi=213"

      /** UNONU UNONU_N55S */
      val UNONU_N55S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** UNONU UNONU_N65_LITE */
      val UNONU_N65_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** UNONU UNONU_U4001 */
      val UNONU_U4001 = "spec:width=480,height=800,unit=px,dpi=240"

      /** UNONU UNONU_W50X */
      val UNONU_W50X = "spec:width=480,height=960,unit=px,dpi=240"

      /** UNONU UNONU_W57A */
      val UNONU_W57A = "spec:width=480,height=960,unit=px,dpi=240"

      /** UNONU UNONU_W609 */
      val UNONU_W609 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** UNONU UNONU_W61 */
      val UNONU_W61 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** UNONU UT3G */
      val UT3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** UNONU UT3GPlus */
      val UT3GPLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** UNONU W50A */
      val W50A = "spec:width=480,height=854,unit=px,dpi=240"

  }
