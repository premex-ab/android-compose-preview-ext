package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MTT device specifications for Android Compose previews.
 *
 * This extension provides MTT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mtt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mtt: Any
  get() = object {
      /** MTT L506 */
      val L506 = "spec:width=368,height=448,unit=px,dpi=180"

  }
