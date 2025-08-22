package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FMC device specifications for Android Compose previews.
 *
 * This extension provides FMC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fmc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fmc: Any
  get() = object {
      /** FMC belford */
      val BELFORD = "spec:width=1080,height=2348,unit=px,dpi=200"

  }
