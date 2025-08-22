package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Qmobile device specifications for Android Compose previews.
 *
 * This extension provides Qmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qmobile: Any
  get() = object {
      /** Qmobile i8i */
      val I8I = "spec:width=480,height=854,unit=px,dpi=240"

      /** Qmobile i8i_PRO */
      val I8I_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** Qmobile i8i_Pro_II */
      val I8I_PRO_II = "spec:width=480,height=960,unit=px,dpi=240"

      /** Qmobile Phantom_P1 */
      val PHANTOM_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Qmobile Phantom_P1_Pro */
      val PHANTOM_P1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Qmobile Q_Infinity_B */
      val Q_INFINITY_B = "spec:width=480,height=960,unit=px,dpi=240"

      /** Qmobile Q_Infinity_C */
      val Q_INFINITY_C = "spec:width=480,height=960,unit=px,dpi=240"

  }
