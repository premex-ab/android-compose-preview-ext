package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ghia device specifications for Android Compose previews.
 *
 * This extension provides ghia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ghia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ghia: Any
  get() = object {
      /** ghia GA8N2 */
      val GA8N2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ghia GK133M24 */
      val GK133M24 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ghia GK133P24 */
      val GK133P24 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ghia GK523A24 */
      val GK523A24 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ghia GPND133V4 */
      val GPND133V4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ghia GVLTE13 */
      val GVLTE13 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
