package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Movix device specifications for Android Compose previews.
 *
 * This extension provides Movix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movix: Any
  get() = object {
      /** Movix MVX01 */
      val MVX01 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Movix MVX02 */
      val MVX02 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Movix MVX03 */
      val MVX03 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Movix SEI700ER */
      val SEI700ER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
