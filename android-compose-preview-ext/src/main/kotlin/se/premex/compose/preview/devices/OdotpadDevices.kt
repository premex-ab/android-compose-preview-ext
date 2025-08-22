package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * odotpad device specifications for Android Compose previews.
 *
 * This extension provides odotpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Odotpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Odotpad: Any
  get() = object {
      /** odotpad PS8 */
      val PS8 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
