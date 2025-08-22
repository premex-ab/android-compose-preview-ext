package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Vexia device specifications for Android Compose previews.
 *
 * This extension provides Vexia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vexia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vexia: Any
  get() = object {
      /** Vexia NicatabletV3 */
      val NICATABLETV3 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
