package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Disney_Pixar device specifications for Android Compose previews.
 *
 * This extension provides Disney_Pixar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DisneyPixar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DisneyPixar: Any
  get() = object {
      /** Disney_Pixar Toy_story */
      val TOY_STORY = "spec:width=600,height=1024,unit=px,dpi=160"

  }
