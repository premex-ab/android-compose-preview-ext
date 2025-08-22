package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BOTHO_University device specifications for Android Compose previews.
 *
 * This extension provides BOTHO_University device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BothoUniversity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BothoUniversity: Any
  get() = object {
      /** BOTHO_University GLTAB101 */
      val GLTAB101 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
