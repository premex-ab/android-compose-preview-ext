package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VOLENTEX device specifications for Android Compose previews.
 *
 * This extension provides VOLENTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Volentex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Volentex: Any
  get() = object {
      /** VOLENTEX M10_A04 */
      val M10_A04 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
