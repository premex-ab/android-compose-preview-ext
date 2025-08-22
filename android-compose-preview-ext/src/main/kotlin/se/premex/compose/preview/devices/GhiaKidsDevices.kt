package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GHIA_KIDS device specifications for Android Compose previews.
 *
 * This extension provides GHIA_KIDS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GhiaKids.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GhiaKids: Any
  get() = object {
      /** GHIA_KIDS GTKIDS7 */
      val GTKIDS7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
