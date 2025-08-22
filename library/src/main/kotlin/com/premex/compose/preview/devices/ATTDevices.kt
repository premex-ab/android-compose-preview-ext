package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATT device specifications for Android Compose previews.
 *
 * This extension provides ATT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATT: Any
  get() = object {
      /** ATT c71kw200 */
      val C71KW200 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ATT c71kw400 */
      val C71KW400 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ATT c71kw400-4gb */
      val C71KW400_4GB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ATT c71kw400-BEAM */
      val C71KW400_BEAM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ATT EA211001 */
      val EA211001 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** ATT EA211002 */
      val EA211002 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** ATT EA211005 */
      val EA211005 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** ATT QS5509QL */
      val QS5509QL = "spec:width=480,height=854,unit=px,dpi=240"

      /** ATT SL219A */
      val SL219A = "spec:width=720,height=1600,unit=px,dpi=260"

      /** ATT SN509A */
      val SN509A = "spec:width=720,height=1600,unit=px,dpi=260"

      /** ATT tint8_att */
      val TINT8_ATT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATT U202AA */
      val U202AA = "spec:width=480,height=960,unit=px,dpi=213"

      /** ATT U304AA */
      val U304AA = "spec:width=480,height=960,unit=px,dpi=213"

      /** ATT U318AA */
      val U318AA = "spec:width=480,height=960,unit=px,dpi=213"

      /** ATT U319AA */
      val U319AA = "spec:width=720,height=1440,unit=px,dpi=300"

      /** ATT U380AA */
      val U380AA = "spec:width=720,height=1560,unit=px,dpi=300"

      /** ATT U6080AA */
      val U6080AA = "spec:width=720,height=1612,unit=px,dpi=280"

      /** ATT U626AA */
      val U626AA = "spec:width=720,height=1600,unit=px,dpi=280"

      /** ATT U705AA */
      val U705AA = "spec:width=720,height=1600,unit=px,dpi=300"

      /** ATT WTATTRW2 */
      val WTATTRW2 = "spec:width=720,height=1440,unit=px,dpi=280"

  }
