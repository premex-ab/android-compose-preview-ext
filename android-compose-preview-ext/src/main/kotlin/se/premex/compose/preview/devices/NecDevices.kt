package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NEC device specifications for Android Compose previews.
 *
 * This extension provides NEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nec: Any
  get() = object {
      /** NEC D000000039 */
      val D000000039 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** NEC LAVIET11112K1 */
      val LAVIET11112K1 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** NEC LAVIET1111QHD1 */
      val LAVIET1111QHD1 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** NEC LAVIET77SD1 */
      val LAVIET77SD1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NEC LAVIET88HD1 */
      val LAVIET88HD1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** NEC LaVieTab */
      val LAVIETAB = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NEC LAVIETab102K1 */
      val LAVIETAB102K1 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** NEC LAVIETab10FHD3 */
      val LAVIETAB10FHD3 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** NEC LAVIETab112K2 */
      val LAVIETAB112K2 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** NEC LAVIETab11FHD1 */
      val LAVIETAB11FHD1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** NEC LAVIETab11QHD2 */
      val LAVIETAB11QHD2 = "spec:width=1536,height=2560,unit=px,dpi=320"

      /** NEC LAVIETab143K1 */
      val LAVIETAB143K1 = "spec:width=1876,height=3000,unit=px,dpi=320"

      /** NEC LAVIETab9QHD1 */
      val LAVIETAB9QHD1 = "spec:width=1600,height=2560,unit=px,dpi=400"

      /** NEC LAVIETabE10FHD1 */
      val LAVIETABE10FHD1 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** NEC LAVIETabE10FHD2 */
      val LAVIETABE10FHD2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** NEC LAVIETabE7SD1 */
      val LAVIETABE7SD1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** NEC LAVIETabE8FHD1 */
      val LAVIETABE8FHD1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** NEC LAVIETabE8HD1 */
      val LAVIETABE8HD1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** NEC LAVIETabT1212QHD1 */
      val LAVIETABT1212QHD1 = "spec:width=1600,height=2560,unit=px,dpi=240"

      /** NEC PC-TE410JAW */
      val PC_TE410JAW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** NEC PC-TE508HAW */
      val PC_TE508HAW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NEC PC-TE508S1_nec */
      val PC_TE508S1_NEC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NEC PC-TE510JAW */
      val PC_TE510JAW = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** NEC PC-TE510S1_nec */
      val PC_TE510S1_NEC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** NEC PC-TS507N1S */
      val PC_TS507N1S = "spec:width=800,height=1280,unit=px,dpi=213"

      /** NEC PC-TS508FAM */
      val PC_TS508FAM = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** NEC TE507FAW */
      val TE507FAW = "spec:width=720,height=1280,unit=px,dpi=240"

      /** NEC 508T1W */
      val _508T1W = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** NEC 708T1W */
      val _708T1W = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
