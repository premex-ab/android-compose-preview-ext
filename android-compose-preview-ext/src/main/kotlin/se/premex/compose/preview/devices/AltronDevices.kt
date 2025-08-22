package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALTRON device specifications for Android Compose previews.
 *
 * This extension provides ALTRON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Altron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Altron: Any
  get() = object {
      /** ALTRON BE-730 */
      val BE_730 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
