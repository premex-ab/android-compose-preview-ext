package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DiDi device specifications for Android Compose previews.
 *
 * This extension provides DiDi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Didi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Didi: Any
  get() = object {
      /** DiDi DDT-001 */
      val DDT_001 = "spec:width=720,height=1280,unit=px,dpi=240"

  }
