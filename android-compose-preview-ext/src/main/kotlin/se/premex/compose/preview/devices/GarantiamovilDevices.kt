package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GarantiaMOVIL device specifications for Android Compose previews.
 *
 * This extension provides GarantiaMOVIL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Garantiamovil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Garantiamovil: Any
  get() = object {
      /** GarantiaMOVIL L604 */
      val L604 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
