package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FATARUS device specifications for Android Compose previews.
 *
 * This extension provides FATARUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fatarus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fatarus: Any
  get() = object {
      /** FATARUS K10 */
      val K10 = "spec:width=800,height=1332,unit=px,dpi=240"

  }
