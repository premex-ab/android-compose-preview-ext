package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * koobee device specifications for Android Compose previews.
 *
 * This extension provides koobee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Koobee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Koobee: Any
  get() = object {
      /** koobee koobee_F2 */
      val KOOBEE_F2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** koobee koobee_F2_Plus */
      val KOOBEE_F2_PLUS = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** koobee koobee_K10 */
      val KOOBEE_K10 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** koobee koobee_K20 */
      val KOOBEE_K20 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** koobee koobee_S12 */
      val KOOBEE_S12 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** koobee koobee_S16 */
      val KOOBEE_S16 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
