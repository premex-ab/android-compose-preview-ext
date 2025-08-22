package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DL device specifications for Android Compose previews.
 *
 * This extension provides DL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DL: Any
  get() = object {
      /** DL TabKids_Plus */
      val TABKIDS_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_2810 */
      val TABLET_DL_2810 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_2811 */
      val TABLET_DL_2811 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_2820 */
      val TABLET_DL_2820 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_3721 */
      val TABLET_DL_3721 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_3722 */
      val TABLET_DL_3722 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_3723 */
      val TABLET_DL_3723 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_3724 */
      val TABLET_DL_3724 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_3725 */
      val TABLET_DL_3725 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DL Tablet_DL_4010 */
      val TABLET_DL_4010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DL X_Quad_Pro */
      val X_QUAD_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }
