package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * JUSTSYSTEMS device specifications for Android Compose previews.
 *
 * This extension provides JUSTSYSTEMS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Justsystems.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Justsystems: Any
  get() = object {
      /** JUSTSYSTEMS SZJ201 */
      val SZJ201 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUSTSYSTEMS SZJ202 */
      val SZJ202 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** JUSTSYSTEMS SZJ203 */
      val SZJ203 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
