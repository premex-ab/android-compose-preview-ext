package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZooomTV device specifications for Android Compose previews.
 *
 * This extension provides ZooomTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zooomtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zooomtv: Any
  get() = object {
      /** ZooomTV DV8529-T2_S2-KSI */
      val DV8529_T2_S2_KSI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
