package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TelusCorporation device specifications for Android Compose previews.
 *
 * This extension provides TelusCorporation device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teluscorporation.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teluscorporation: Any
  get() = object {
      /** TelusCorporation HMB2213PW22TS */
      val HMB2213PW22TS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
