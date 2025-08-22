package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FCNT device specifications for Android Compose previews.
 *
 * This extension provides FCNT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FCNT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FCNT: Any
  get() = object {
      /** FCNT A101FC */
      val A101FC = "spec:width=720,height=1520,unit=px,dpi=320"

      /** FCNT A401FC */
      val A401FC = "spec:width=720,height=1560,unit=px,dpi=360"

      /** FCNT A402FC */
      val A402FC = "spec:width=720,height=1560,unit=px,dpi=320"

      /** FCNT BZ02 */
      val BZ02 = "spec:width=720,height=1480,unit=px,dpi=320"

      /** FCNT BZ03 */
      val BZ03 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** FCNT F41B */
      val F41B = "spec:width=720,height=1480,unit=px,dpi=320"

      /** FCNT F51B */
      val F51B = "spec:width=720,height=1520,unit=px,dpi=320"

      /** FCNT F51C */
      val F51C = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** FCNT F51E */
      val F51E = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** FCNT F52B */
      val F52B = "spec:width=1080,height=1980,unit=px,dpi=480"

      /** FCNT F52E */
      val F52E = "spec:width=720,height=1560,unit=px,dpi=320"

      /** FCNT F53E */
      val F53E = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** FCNT FCG01 */
      val FCG01 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** FCNT FCG02 */
      val FCG02 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** FCNT fuji */
      val FUJI = "spec:width=1200,height=2670,unit=px,dpi=450"

      /** FCNT F-51F */
      val F_51F = "spec:width=1200,height=2670,unit=px,dpi=450"

      /** FCNT M06 */
      val M06 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** FCNT M07 */
      val M07 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** FCNT MR01 */
      val MR01 = "spec:width=720,height=1560,unit=px,dpi=360"

  }
