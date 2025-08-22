package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MyRepublic_STB_2023 device specifications for Android Compose previews.
 *
 * This extension provides MyRepublic_STB_2023 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MyrepublicStb2023.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MyrepublicStb2023: Any
  get() = object {
      /** MyRepublic_STB_2023 B866V2FAV3 */
      val B866V2FAV3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
