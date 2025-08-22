package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMADL device specifications for Android Compose previews.
 *
 * This extension provides SMADL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smadl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smadl: Any
  get() = object {
      /** SMADL Matri2 */
      val MATRI2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SMADL Safari */
      val SAFARI = "spec:width=480,height=960,unit=px,dpi=240"

      /** SMADL Safari_2 */
      val SAFARI_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** SMADL Safari_2plus */
      val SAFARI_2PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** SMADL SMADL_Abay5_Plus */
      val SMADL_ABAY5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** SMADL SMADL_R35_FW */
      val SMADL_R35_FW = "spec:width=480,height=854,unit=px,dpi=240"

  }
