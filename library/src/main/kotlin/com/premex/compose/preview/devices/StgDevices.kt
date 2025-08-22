package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STG device specifications for Android Compose previews.
 *
 * This extension provides STG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Stg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Stg: Any
  get() = object {
      /** STG STG_A1 */
      val STG_A1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** STG STG_A1_Pro */
      val STG_A1_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** STG STG_A2_Pro */
      val STG_A2_PRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** STG STG_B10 */
      val STG_B10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** STG STG_C10 */
      val STG_C10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** STG STG_K10 */
      val STG_K10 = "spec:width=720,height=1560,unit=px,dpi=360"

      /** STG STG_P10 */
      val STG_P10 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** STG STG_S1 */
      val STG_S1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** STG STG_S10 */
      val STG_S10 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** STG STG_S20 */
      val STG_S20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** STG STG_S30 */
      val STG_S30 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** STG STG_X1 */
      val STG_X1 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** STG STG_X2 */
      val STG_X2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** STG STG_X3 */
      val STG_X3 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
