package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MioTab device specifications for Android Compose previews.
 *
 * This extension provides MioTab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Miotab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Miotab: Any
  get() = object {
      /** MioTab MioTab2017 */
      val MIOTAB2017 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MioTab Mio_Tab_2019 */
      val MIO_TAB_2019 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MioTab MP0101632 */
      val MP0101632 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** MioTab MP0101635 */
      val MP0101635 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MioTab MP0101788 */
      val MP0101788 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MioTab MP0101789 */
      val MP0101789 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
