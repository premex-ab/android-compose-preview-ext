package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Datamini-TWG10 device specifications for Android Compose previews.
 *
 * This extension provides Datamini-TWG10 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DataminiTwg10.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DataminiTwg10: Any
  get() = object {
      /** Datamini-TWG10 K508101 */
      val K508101 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
