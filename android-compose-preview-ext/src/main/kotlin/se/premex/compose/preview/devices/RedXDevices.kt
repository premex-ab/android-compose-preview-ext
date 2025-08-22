package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RED-X device specifications for Android Compose previews.
 *
 * This extension provides RED-X device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RedX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RedX: Any
  get() = object {
      /** RED-X RED-X_RX4505 */
      val RED_X_RX4505 = "spec:width=480,height=854,unit=px,dpi=240"

      /** RED-X RED-X_RX4559 */
      val RED_X_RX4559 = "spec:width=480,height=960,unit=px,dpi=240"

      /** RED-X RX4618 */
      val RX4618 = "spec:width=480,height=996,unit=px,dpi=240"

      /** RED-X RX4802 */
      val RX4802 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
