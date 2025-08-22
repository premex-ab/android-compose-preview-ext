package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Gplus device specifications for Android Compose previews.
 *
 * This extension provides Gplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gplus: Any
  get() = object {
      /** Gplus P10 */
      val P10 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Gplus P10_2022 */
      val P10_2022 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Gplus P10_Plus */
      val P10_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Gplus Q10 */
      val Q10 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Gplus S10 */
      val S10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Gplus T10 */
      val T10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Gplus X10 */
      val X10 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Gplus X10_Plus */
      val X10_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Gplus Z10 */
      val Z10 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
