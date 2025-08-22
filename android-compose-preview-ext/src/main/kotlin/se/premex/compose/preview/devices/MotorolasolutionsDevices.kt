package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MotorolaSolutions device specifications for Android Compose previews.
 *
 * This extension provides MotorolaSolutions device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Motorolasolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Motorolasolutions: Any
  get() = object {
      /** MotorolaSolutions LEXF10 */
      val LEXF10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** MotorolaSolutions lexl10ig */
      val LEXL10IG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MotorolaSolutions lexl11g_64 */
      val LEXL11G_64 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
