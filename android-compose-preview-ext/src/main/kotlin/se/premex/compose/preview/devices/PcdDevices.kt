package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PCD device specifications for Android Compose previews.
 *
 * This extension provides PCD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pcd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pcd: Any
  get() = object {
      /** PCD Bengal_Max_iW */
      val BENGAL_MAX_IW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** PCD P40 */
      val P40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** PCD P41 */
      val P41 = "spec:width=480,height=800,unit=px,dpi=240"

      /** PCD P50 */
      val P50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** PCD P50PR */
      val P50PR = "spec:width=480,height=854,unit=px,dpi=240"

      /** PCD P55 */
      val P55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** PCD P60 */
      val P60 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** PCD P60_CA */
      val P60_CA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** PCD P60_CENAM */
      val P60_CENAM = "spec:width=600,height=1280,unit=px,dpi=240"

      /** PCD P63L_PR */
      val P63L_PR = "spec:width=720,height=1520,unit=px,dpi=320"

      /** PCD P65 */
      val P65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** PCD P65_CA */
      val P65_CA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** PCD PH4003 */
      val PH4003 = "spec:width=480,height=800,unit=px,dpi=240"

      /** PCD PH4003GO */
      val PH4003GO = "spec:width=480,height=800,unit=px,dpi=240"

      /** PCD PH5003 */
      val PH5003 = "spec:width=480,height=854,unit=px,dpi=240"

      /** PCD PH5003_Go */
      val PH5003_GO = "spec:width=480,height=854,unit=px,dpi=240"

      /** PCD PL550 */
      val PL550 = "spec:width=480,height=960,unit=px,dpi=240"

      /** PCD PL571 */
      val PL571 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** PCD PL571US */
      val PL571US = "spec:width=720,height=1440,unit=px,dpi=320"

  }
