package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Insys device specifications for Android Compose previews.
 *
 * This extension provides Insys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Insys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Insys: Any
  get() = object {
      /** Insys HK9-4010 */
      val HK9_4010 = "spec:width=480,height=800,unit=px,dpi=240"

  }
