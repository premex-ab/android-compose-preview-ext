package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AIRPHA device specifications for Android Compose previews.
 *
 * This extension provides AIRPHA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Airpha.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Airpha: Any
  get() = object {
      /** AIRPHA Halo4_Pro */
      val HALO4_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
