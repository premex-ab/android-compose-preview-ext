package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PitneyBowes device specifications for Android Compose previews.
 *
 * This extension provides PitneyBowes device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pitneybowes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pitneybowes: Any
  get() = object {
      /** PitneyBowes TitanX2 */
      val TITANX2 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
