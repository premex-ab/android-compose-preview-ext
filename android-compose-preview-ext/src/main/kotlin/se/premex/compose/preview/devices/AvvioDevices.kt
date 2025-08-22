package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Avvio device specifications for Android Compose previews.
 *
 * This extension provides Avvio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Avvio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Avvio: Any
  get() = object {
      /** Avvio Avvio_4GO */
      val AVVIO_4GO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Avvio Avvio_A400 */
      val AVVIO_A400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Avvio Avvio_Q503 */
      val AVVIO_Q503 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
