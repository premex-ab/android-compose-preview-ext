package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SOLONE device specifications for Android Compose previews.
 *
 * This extension provides SOLONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Solone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Solone: Any
  get() = object {
      /** SOLONE E1457 */
      val E1457 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SOLONE W1450 */
      val W1450 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SOLONE W1452 */
      val W1452 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
