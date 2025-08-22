package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ajib device specifications for Android Compose previews.
 *
 * This extension provides ajib device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ajib.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ajib: Any
  get() = object {
      /** ajib ajib_i10 */
      val AJIB_I10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** ajib ajib_l1 */
      val AJIB_L1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ajib ajib_X1 */
      val AJIB_X1 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** ajib i15 */
      val I15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ajib i25 */
      val I25 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
