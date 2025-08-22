package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DreamMaker device specifications for Android Compose previews.
 *
 * This extension provides DreamMaker device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dreammaker.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dreammaker: Any
  get() = object {
      /** DreamMaker DPLAY */
      val DPLAY = "spec:width=800,height=1280,unit=px,dpi=160"

  }
