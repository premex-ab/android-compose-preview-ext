package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HBESTORE device specifications for Android Compose previews.
 *
 * This extension provides HBESTORE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hbestore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hbestore: Any
  get() = object {
      /** HBESTORE HL_1068_A133 */
      val HL_1068_A133 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
