package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * rainx device specifications for Android Compose previews.
 *
 * This extension provides rainx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rainx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rainx: Any
  get() = object {
      /** rainx the101loop */
      val THE101LOOP = "spec:width=1080,height=1920,unit=px,dpi=400"

  }
