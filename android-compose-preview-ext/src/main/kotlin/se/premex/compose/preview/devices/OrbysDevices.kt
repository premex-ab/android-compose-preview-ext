package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ORBYS device specifications for Android Compose previews.
 *
 * This extension provides ORBYS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orbys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orbys: Any
  get() = object {
      /** ORBYS F21 */
      val F21 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
